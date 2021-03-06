/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/
package org.apache.airavata.gfac.local.handler;

import org.apache.airavata.commons.gfac.type.ActualParameter;
import org.apache.airavata.gfac.core.context.JobExecutionContext;
import org.apache.airavata.gfac.core.handler.GFacHandler;
import org.apache.airavata.gfac.core.handler.GFacHandlerException;
import org.apache.airavata.schemas.gfac.StringParameterType;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import java.lang.String;
import java.util.Map;
import java.util.Properties;



public class InputEmailHandler implements GFacHandler {
    private Properties props;

    public void initProperties(Properties properties) throws GFacHandlerException {
        System.out.println("Initializing " + InputEmailHandler.class + " Handler...");
        props = properties;
    }

    public void invoke(JobExecutionContext jobExecutionContext) throws GFacHandlerException {
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication((String) props.get("username"), (String) props.get("password"));
//                    }
//                });
//
//        Message message = new MimeMessage(session);
//        try {
//            message.setFrom(new InternetAddress((String) props.get("username")));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse((String) props.get("username")));
//            message.setSubject("GFAC Input Email");
//

//            Transport.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        System.out.println("Start Emailing the input values ... ");
//        try {
//            Session mailSession = Session.getDefaultInstance(props, null);
//            Transport transport = mailSession.getTransport();
//
//            MimeMessage message = new MimeMessage(mailSession);
//            message.setSubject("GFAC Inputs");
//            Map<String, Object> parameters = jobExecutionContext.getOutMessageContext().getParameters();
//            StringBuffer buffer = new StringBuffer();
//            for (String input : parameters.keySet()) {
//                ActualParameter inParam = (ActualParameter) parameters.get(input);
//                String paramDataType = inParam.getType().getType().toString();
//                if ("String".equals(paramDataType)) {
//                    String stringPrm = ((StringParameterType) inParam.getType())
//                            .getValue();
//                    buffer.append("Input Name: input: Input Value: " + stringPrm + "\n");
//                }
//            }
//            message.setContent(buffer.toString(), "text/plain");
//            message.addRecipient(Message.RecipientType.TO,
//                    new InternetAddress((String) props.get("username")));
//
//            transport.connect();
//            transport.sendMessage(message,
//                    message.getRecipients(Message.RecipientType.TO));
//            transport.close();
//            System.out.println("Sent email to : " + props.get("username"));
//        } catch (Exception e) {
//
//        }
             System.out.println("Start Emailing the input values ... ");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication((String) props.get("username"), (String) props.get("password"));
                    }
                });

        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress((String) props.get("username")));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse((String) props.get("username")));
            message.setSubject("GFAC Input Email");

            Map<String, Object> parameters = jobExecutionContext.getInMessageContext().getParameters();
            StringBuffer buffer = new StringBuffer();
            for (String input : parameters.keySet()) {
                ActualParameter inParam = (ActualParameter) parameters.get(input);
                String paramDataType = inParam.getType().getType().toString();
                if ("String".equals(paramDataType)) {
                    String stringPrm = ((StringParameterType) inParam.getType())
                            .getValue();
                    buffer.append("Input Name:" +  input + " Input Value: " + stringPrm + "\n");
                }
            }
            message.setText(buffer.toString());
            Transport.send(message);
            System.out.println("Sent email to : " + props.get("username"));
        } catch (MessagingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
