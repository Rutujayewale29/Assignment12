package com.anudip;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao
{
 JdbcTemplate jdbcTemplate;
 
 public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
 {
	 this.jdbcTemplate=jdbcTemplate;
 }
 //method for add agent
 public int saveAgent(Agent a)
 {
	 String query="insert into agent_info values('"+a.getId()+"','"+a.getName()+"','"+a.getComission()+"')";
	return jdbcTemplate.update(query);
 }
 //method for update agent
 public int updateAgent(Agent a)
 {
	 String query="update agent_info set comission='"+a.getComission()+"'where id='"+a.getId()+"'";
	return jdbcTemplate.update(query); 
 }
 //method for delete agent
 public int deleteAgent(Agent a)
 {
	 String query="delete from agent_info where id='"+a.getId()+"'";
	return jdbcTemplate.update(query);
 }
}
