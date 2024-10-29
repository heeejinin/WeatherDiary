package zerobase.weather.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
// @Transactional 이 활성화 되어 있으면 test 코드에서 저장하고 삭제하더라도 코드가 진행되고 난 뒤에는 원상복구 시킨다
class JdbcMemoRepositoryTest {
    @Autowired
    JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertMemoTest() {
        // given : 주어진 것
        Memo newMemo = new Memo(2, "insertMemoTest");

        // when : ~을 했을 때
        jdbcMemoRepository.save(newMemo);

        // then : ~것이다.
        Optional<Memo> result = jdbcMemoRepository.findById(2);
        assertEquals(result.get().getText(), "insertMemoTest");
    }

    @Test
    void findAllMemoTest() {
        //given

        //when
        List<Memo> memoList = jdbcMemoRepository.findAll();
        System.out.println(memoList);

        //then
        assertNotNull(memoList);
    }

}