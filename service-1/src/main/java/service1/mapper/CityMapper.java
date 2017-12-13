package service1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import service1.domain.City;

/**
 * Created by jomalone_jia on 2017/12/11.
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

}
