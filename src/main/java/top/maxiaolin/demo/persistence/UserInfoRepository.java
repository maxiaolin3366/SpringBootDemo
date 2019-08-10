package top.maxiaolin.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.maxiaolin.demo.domain.UserInfo;


@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    UserInfo getByPhone(String phone);
}
