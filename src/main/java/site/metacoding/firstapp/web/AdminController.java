package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Admin;
import site.metacoding.firstapp.domain.AdminDao;

@RequiredArgsConstructor
@Controller
public class AdminController {
	private final AdminDao adminDao;

	@GetMapping("/admin/join") // 화면 출력되는지 확인 완료
	public String adminjoin() {
		return "admin/adminjoin";
	}

	@PostMapping("/admin/join/insert")
	public String 관리자회원가입(Admin admin) {
		// 테스트할때 디비 / Dao /Dto 확인 후 값이 안들어가면 view name이 엔티티랑 같은지 확인하기!
		System.out.println(admin.getAdminName());
		adminDao.insert(admin);
		System.out.println(admin.getAdminName());
		return "redirect:/";
	}//
}
