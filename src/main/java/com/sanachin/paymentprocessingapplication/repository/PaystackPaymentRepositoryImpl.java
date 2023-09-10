package com.sanachin.paymentprocessingapplication.repository;

import com.sanachin.paymentprocessingapplication.model.domain.PaymentPaystack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaystackPaymentRepositoryImpl extends JpaRepository<PaymentPaystack, Long> {
}
