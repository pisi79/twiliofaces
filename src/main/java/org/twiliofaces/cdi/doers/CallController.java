/*
 * Copyright 2013 twiliofaces.org.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.twiliofaces.cdi.doers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.twiliofaces.cdi.doers.simple.SimpleCallController;
import org.twiliofaces.inject.configuration.TwilioAccountSid;
import org.twiliofaces.inject.configuration.TwilioAuthToken;

@Named
@RequestScoped
public class CallController extends SimpleCallController
{

   @Inject
   public CallController(@TwilioAccountSid String accountSid, @TwilioAuthToken String authToken)
   {
      super(accountSid, authToken);
   }

   public CallController()
   {
   }
}
