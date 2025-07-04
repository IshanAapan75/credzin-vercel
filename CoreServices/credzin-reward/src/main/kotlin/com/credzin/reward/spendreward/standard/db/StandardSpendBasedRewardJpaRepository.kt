package com.credzin.reward.spendreward.standard.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface StandardSpendBasedRewardJpaRepository : JpaRepository<JpaStandardSpendBasedRewardEntity, UUID> {
    fun findByTransactionId(transactionId: UUID): List<JpaStandardSpendBasedRewardEntity>
}
