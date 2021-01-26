package fun.duqian.backgroud.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import fun.duqian.backgroud.mapper.UserMapper;
import fun.duqian.backgroud.entity.User;
@Service
public class UserService{

    @Resource
    private UserMapper userMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(User record) {
        return userMapper.insert(record);
    }

    
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<User> list) {
        return userMapper.updateBatch(list);
    }

    
    public int batchInsert(List<User> list) {
        return userMapper.batchInsert(list);
    }

}
