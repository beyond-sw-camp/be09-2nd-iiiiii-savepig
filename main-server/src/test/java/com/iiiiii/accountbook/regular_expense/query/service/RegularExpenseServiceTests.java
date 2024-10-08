package com.iiiiii.accountbook.regular_expense.query.service;

import com.iiiiii.accountbook.regular_expense.query.dto.RegularExpenseDTO;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RegularExpenseServiceTests {

    @Autowired
    private RegularExpenseService regularExpenseService;

    @DisplayName("고정 지출 목록 조회 확인 테스트")
    @Test
    public void testFindAllRegularExpenses() {
        List<RegularExpenseDTO> list = regularExpenseService.findAllRegularExpenses();

        assertTrue(!list.isEmpty());
    }

    @DisplayName("멤버의 고정 지출 목록 조회 확인 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testFindOneMemberRegularExpenses(int memberCode) {
        List<RegularExpenseDTO> list = regularExpenseService.findOneMemberRegularExpenses(memberCode);

        assertTrue(!list.isEmpty());
    }

    @DisplayName("기본키로 고정 지출 조회 확인 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testFindOneRegularExpenses(int code) {
        RegularExpenseDTO one = regularExpenseService.findOneRegularExpenses(code);

        assertTrue(one != null);
    }
}
