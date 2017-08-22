/**
 * Copyright (C) 2016 Alfresco Software Limited.
 * <p/>
 * This file is part of the Alfresco SDK Samples project.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.alfresco.training.activiti.task;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple service task implemented as a Java Delegate.
 *
 * This is version 1.0 of the implementation of this service task. See
 * com.activiti.extension.bean package for version 2.0.
 *
 * @author martin.bergljung@alfresco.com
 */
public class FileInvoiceServiceTaskDelegate implements JavaDelegate {
    private static Logger logger = LoggerFactory.getLogger(FileInvoiceServiceTaskDelegate.class);


    /**
     * Injected class fields
     */
    private Expression companyEmail;
    private Expression invoiceToFile;


    public void execute(DelegateExecution execution) throws Exception {
        logger.debug("Storing the invoice file somewhere safe!");


        String emailAddress = (String) companyEmail.getValue(execution);
        logger.debug("The invoice was sent in from: " + emailAddress);


        // We will deal with the invoiceToFile field later on
    }


    public void setCompanyEmail(Expression companyEmail) {
        this.companyEmail = companyEmail;
    }


    public void setInvoiceToFile(Expression invoiceToFile) {
        this.invoiceToFile = invoiceToFile;
    }
}