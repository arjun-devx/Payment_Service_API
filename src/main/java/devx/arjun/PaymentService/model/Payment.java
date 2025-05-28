package devx.arjun.PaymentService.model;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Payment extends BaseModel {
    private String orderId;
    private double amount;
    private String paymentRefNo;
    private LocalDateTime paymentInitTime;
    private LocalDateTime paymentCompletionTime;
    private String paymentStatus;
    private String userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentRefNo() {
        return paymentRefNo;
    }

    public void setPaymentRefNo(String paymentRefNo) {
        this.paymentRefNo = paymentRefNo;
    }

    public LocalDateTime getPaymentInitTime() {
        return paymentInitTime;
    }

    public void setPaymentInitTime(LocalDateTime paymentInitTime) {
        this.paymentInitTime = paymentInitTime;
    }

    public LocalDateTime getPaymentCompletionTime() {
        return paymentCompletionTime;
    }

    public void setPaymentCompletionTime(LocalDateTime paymentCompletionTime) {
        this.paymentCompletionTime = paymentCompletionTime;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
