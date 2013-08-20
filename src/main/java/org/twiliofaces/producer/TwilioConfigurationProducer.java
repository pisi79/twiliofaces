/*
 * Copyright 2013 twiliofaces.org.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.twiliofaces.producer;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.twiliofaces.annotations.configuration.ApiVersion;
import org.twiliofaces.annotations.configuration.ApplicationSid;
import org.twiliofaces.annotations.configuration.TwilioNumber;
import org.twiliofaces.annotations.configuration.TwilioSid;
import org.twiliofaces.annotations.configuration.TwilioToken;
import org.twiliofaces.annotations.notification.AccountSid;
import org.twiliofaces.api.enums.TwilioConfigurationEnum;
import org.twiliofaces.api.enums.TwilioRequestParamsEnum;

public class TwilioConfigurationProducer implements Serializable
{

   private static final long serialVersionUID = 1L;
   @Inject
   FacesContext facesContext;

   @Produces
   @AccountSid
   public String getAccountSid()
   {
      if (facesContext != null && facesContext.getExternalContext() != null
               && facesContext.getExternalContext().getRequestParameterMap() != null)
      {
         return facesContext.getExternalContext().getRequestParameterMap()
                  .get(TwilioRequestParamsEnum.AccountSid.name());
      }
      return null;
   }

   @Produces
   @ApiVersion
   public String getApiVersion()
   {
      if (facesContext != null && facesContext.getExternalContext() != null
               && facesContext.getExternalContext().getRequestParameterMap() != null)
      {
         return facesContext.getExternalContext().getRequestParameterMap()
                  .get(TwilioRequestParamsEnum.ApiVersion.name());
      }
      return null;
   }

   @Produces
   @ApplicationSid
   public String getApplicationSid()
   {
      if (facesContext != null && facesContext.getExternalContext() != null)
         return facesContext.getExternalContext().getInitParameter(
                  TwilioConfigurationEnum.APPLICATION_SID.name());
      return null;
   }

   @Produces
   @TwilioNumber
   public String getTwilioNumber()
   {
      if (facesContext != null && facesContext.getExternalContext() != null)
         return facesContext.getExternalContext().getInitParameter(
                  TwilioConfigurationEnum.TWILIO_NUMBER.name());
      return null;
   }

   @Produces
   @TwilioSid
   public String getTwilioSid()
   {
      if (facesContext != null && facesContext.getExternalContext() != null)
         return facesContext.getExternalContext().getInitParameter(
                  TwilioConfigurationEnum.TWILIO_SID.name());
      return null;
   }

   @Produces
   @TwilioToken
   public String getTwilioToken()
   {
      if (facesContext != null && facesContext.getExternalContext() != null)
         return facesContext.getExternalContext().getInitParameter(
                  TwilioConfigurationEnum.TWILIO_TOKEN.name());
      return null;
   }

}
