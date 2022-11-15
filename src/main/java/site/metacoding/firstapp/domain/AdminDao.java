package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.users.JoinDto;
import site.metacoding.firstapp.web.dto.request.users.LoginDto;

public interface AdminDao {

	public Admin login(Admin admin);

	public void insert(Admin admin);

	public Admin findById(Integer id);

	public List<Admin> findAll();

	public int update(Admin admin);

	public int deleteById(Integer id);

}
