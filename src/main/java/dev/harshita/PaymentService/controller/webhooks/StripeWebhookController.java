package dev.harshita.PaymentService.controller.webhooks;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/webhook")
public class StripeWebhookController {

    @PostMapping("/")
    public void handleWebhook(@RequestBody Event webhookEvent){

    }


}
