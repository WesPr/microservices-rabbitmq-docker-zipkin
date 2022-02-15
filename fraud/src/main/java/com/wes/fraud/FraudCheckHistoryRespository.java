package com.wes.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRespository extends JpaRepository<FraudCheckHistory, Integer> {
}
