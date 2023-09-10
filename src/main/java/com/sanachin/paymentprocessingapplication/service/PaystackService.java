package com.sanachin.paymentprocessingapplication.service;

import com.sanachin.paymentprocessingapplication.model.dto.CreatePlanDto;
import com.sanachin.paymentprocessingapplication.model.dto.InitializePaymentDto;
import com.sanachin.paymentprocessingapplication.model.reponse.CreatePlanResponse;
import com.sanachin.paymentprocessingapplication.model.reponse.InitializePaymentResponse;
import com.sanachin.paymentprocessingapplication.model.reponse.PaymentVerificationResponse;

public interface PaystackService {
    CreatePlanResponse createPlan(CreatePlanDto createPlanDto) throws Exception;
    InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto);
    PaymentVerificationResponse paymentVerification(String reference, String plan, Long id) throws Exception;
}
