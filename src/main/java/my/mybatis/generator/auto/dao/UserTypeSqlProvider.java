package my.mybatis.generator.auto.dao;

import java.util.List;
import java.util.Map;
import my.mybatis.generator.auto.entity.UserType;
import my.mybatis.generator.auto.entity.UserTypeExample.Criteria;
import my.mybatis.generator.auto.entity.UserTypeExample.Criterion;
import my.mybatis.generator.auto.entity.UserTypeExample;
import org.apache.ibatis.jdbc.SQL;

public class UserTypeSqlProvider {

    public String deleteByExample(UserTypeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("USERTYPE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("USERTYPE");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getRowstamp() != null) {
            sql.VALUES("ROWSTAMP", "#{rowstamp,jdbcType=VARCHAR}");
        }
        
        if (record.getPawprint() != null) {
            sql.VALUES("PAWPRINT", "#{pawprint,jdbcType=VARCHAR}");
        }
        
        if (record.getUsertype() != null) {
            sql.VALUES("USERTYPE", "#{usertype,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmittedBy() != null) {
            sql.VALUES("SUBMITTED_BY", "#{submittedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitted() != null) {
            sql.VALUES("SUBMITTED", "#{submitted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsactive() != null) {
            sql.VALUES("ISACTIVE", "#{isactive,jdbcType=NUMERIC}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserTypeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("ROWSTAMP");
        sql.SELECT("PAWPRINT");
        sql.SELECT("USERTYPE");
        sql.SELECT("SUBMITTED_BY");
        sql.SELECT("SUBMITTED");
        sql.SELECT("ISACTIVE");
        sql.SELECT("EMAIL");
        sql.FROM("USERTYPE");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserType record = (UserType) parameter.get("record");
        UserTypeExample example = (UserTypeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("USERTYPE");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getRowstamp() != null) {
            sql.SET("ROWSTAMP = #{record.rowstamp,jdbcType=VARCHAR}");
        }
        
        if (record.getPawprint() != null) {
            sql.SET("PAWPRINT = #{record.pawprint,jdbcType=VARCHAR}");
        }
        
        if (record.getUsertype() != null) {
            sql.SET("USERTYPE = #{record.usertype,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmittedBy() != null) {
            sql.SET("SUBMITTED_BY = #{record.submittedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitted() != null) {
            sql.SET("SUBMITTED = #{record.submitted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{record.isactive,jdbcType=NUMERIC}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("USERTYPE");
        
        sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
        sql.SET("ROWSTAMP = #{record.rowstamp,jdbcType=VARCHAR}");
        sql.SET("PAWPRINT = #{record.pawprint,jdbcType=VARCHAR}");
        sql.SET("USERTYPE = #{record.usertype,jdbcType=VARCHAR}");
        sql.SET("SUBMITTED_BY = #{record.submittedBy,jdbcType=VARCHAR}");
        sql.SET("SUBMITTED = #{record.submitted,jdbcType=TIMESTAMP}");
        sql.SET("ISACTIVE = #{record.isactive,jdbcType=NUMERIC}");
        sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        
        UserTypeExample example = (UserTypeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserType record) {
        SQL sql = new SQL();
        sql.UPDATE("USERTYPE");
        
        if (record.getRowstamp() != null) {
            sql.SET("ROWSTAMP = #{rowstamp,jdbcType=VARCHAR}");
        }
        
        if (record.getPawprint() != null) {
            sql.SET("PAWPRINT = #{pawprint,jdbcType=VARCHAR}");
        }
        
        if (record.getUsertype() != null) {
            sql.SET("USERTYPE = #{usertype,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmittedBy() != null) {
            sql.SET("SUBMITTED_BY = #{submittedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitted() != null) {
            sql.SET("SUBMITTED = #{submitted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{isactive,jdbcType=NUMERIC}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserTypeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}