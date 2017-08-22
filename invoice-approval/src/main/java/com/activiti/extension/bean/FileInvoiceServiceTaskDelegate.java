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

package com.activiti.extension.bean;

import com.activiti.content.storage.api.ContentObject;
import com.activiti.domain.runtime.RelatedContent;
import com.activiti.service.runtime.RelatedContentService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * A Service Task implemented as a Spring Bean Delegate.
 *
 * @author martin.bergljung@alfresco.com
 */

@Component
public class FileInvoiceServiceTaskDelegate implements JavaDelegate {
    private static Logger logger = LoggerFactory.getLogger(FileInvoiceServiceTaskDelegate.class);


    private static final String INVOICE_FILE_VAR_NAME = "invoicetobeapproved";


    @Autowired
    RelatedContentService relatedContentService;

    private Expression companyEmail;


    public void setCompanyEmail(Expression companyEmail) {
        this.companyEmail = companyEmail;
    }


    public void execute(DelegateExecution execution) throws Exception {
        logger.info("Storing the invoice file somewhere safe!");


        String emailAddress = (String) companyEmail.getValue(execution);
        logger.info("The invoice was sent in from: " + emailAddress);


        List<RelatedContent> contentList = relatedContentService.getFieldContentForProcessInstance(
                execution.getProcessInstanceId(), INVOICE_FILE_VAR_NAME, 1, 0).getContent();



        if (contentList != null) {
            for (RelatedContent relCon : contentList) {
                logger.info("Content file: " + relCon.getName() + ", created: " + relCon.getCreated());



                ContentObject co = relatedContentService.getContentStorage().getContentObject(
                        relCon.getContentStoreId());

                // Get the InputStream and do stuff with the file
                // co.getContent()
            }
        }
    }
}