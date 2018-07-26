package my.mybatis.generator.auto.dao;

import java.util.List;
import my.mybatis.generator.auto.entity.UserType;
import my.mybatis.generator.auto.entity.UserTypeExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserTypeMapper {
    @DeleteProvider(type=UserTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserTypeExample example);

    @Delete({
        "delete from USERTYPE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into USERTYPE (ID, ROWSTAMP, ",
        "PAWPRINT, USERTYPE, ",
        "SUBMITTED_BY, SUBMITTED, ",
        "ISACTIVE, EMAIL)",
        "values (#{id,jdbcType=VARCHAR}, #{rowstamp,jdbcType=VARCHAR}, ",
        "#{pawprint,jdbcType=VARCHAR}, #{usertype,jdbcType=VARCHAR}, ",
        "#{submittedBy,jdbcType=VARCHAR}, #{submitted,jdbcType=TIMESTAMP}, ",
        "#{isactive,jdbcType=NUMERIC}, #{email,jdbcType=VARCHAR})"
    })
    int insert(UserType record);

    @InsertProvider(type=UserTypeSqlProvider.class, method="insertSelective")
    int insertSelective(UserType record);

    @SelectProvider(type=UserTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ROWSTAMP", property="rowstamp", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAWPRINT", property="pawprint", jdbcType=JdbcType.VARCHAR),
        @Result(column="USERTYPE", property="usertype", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBMITTED_BY", property="submittedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBMITTED", property="submitted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ISACTIVE", property="isactive", jdbcType=JdbcType.NUMERIC),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR)
    })
    List<UserType> selectByExample(UserTypeExample example);

    @Select({
        "select",
        "ID, ROWSTAMP, PAWPRINT, USERTYPE, SUBMITTED_BY, SUBMITTED, ISACTIVE, EMAIL",
        "from USERTYPE",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ROWSTAMP", property="rowstamp", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAWPRINT", property="pawprint", jdbcType=JdbcType.VARCHAR),
        @Result(column="USERTYPE", property="usertype", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBMITTED_BY", property="submittedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBMITTED", property="submitted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ISACTIVE", property="isactive", jdbcType=JdbcType.NUMERIC),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR)
    })
    UserType selectByPrimaryKey(String id);

    @UpdateProvider(type=UserTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    @UpdateProvider(type=UserTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);

    @UpdateProvider(type=UserTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserType record);

    @Update({
        "update USERTYPE",
        "set ROWSTAMP = #{rowstamp,jdbcType=VARCHAR},",
          "PAWPRINT = #{pawprint,jdbcType=VARCHAR},",
          "USERTYPE = #{usertype,jdbcType=VARCHAR},",
          "SUBMITTED_BY = #{submittedBy,jdbcType=VARCHAR},",
          "SUBMITTED = #{submitted,jdbcType=TIMESTAMP},",
          "ISACTIVE = #{isactive,jdbcType=NUMERIC},",
          "EMAIL = #{email,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserType record);

    @Select({
        "select",
        "ID, ROWSTAMP, PAWPRINT, USERTYPE, SUBMITTED_BY, SUBMITTED, ISACTIVE, EMAIL",
        "from USERTYPE"
    })
    List<UserType> selectAll();
}