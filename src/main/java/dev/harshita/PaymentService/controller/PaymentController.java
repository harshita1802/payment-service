package dev.harshita.PaymentService.controller;

import dev.harshita.PaymentService.dto.PaymentLinkRequestDto;
import dev.harshita.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity generatePaymentLink(@RequestBody PaymentLinkRequestDto paymentLinkRequestDto){

        return ResponseEntity.ok(paymentService.generatePaymentLink(paymentLinkRequestDto));
    }
}
