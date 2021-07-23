package com.example.psbc.mapper;


import com.example.psbc.entity.Knowledge;
import com.example.psbc.vo.KnowledgeVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface KnowledgeMapper {

    @Select("SELECT question, answer FROM knowledge WHERE knowledge_id = #{id} ")
    KnowledgeVO getQuestionById(@Param("id") Long id);

    @Select("SELECT question, answer FROM knowledge ")
    ArrayList<KnowledgeVO> getAllQuestion();

    @Insert("INSERT INTO knowledge " +
            "VALUES " +
            "(#{knowledge.knowledgeId}, #{knowledge.question}, #{knowledge.answer}, #{knowledge.addTime})")
    int addOneKnowledge(@Param("knowledge") Knowledge knowledge);

    @Select("SELECT MAX(knowledge_id) FROM knowledge")
    Long getId();


}
