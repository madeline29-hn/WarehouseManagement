package Group5.WarehouseManagement.DTO.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Không cho đổi username. Muốn đổi mật khẩu thì gửi kèm password mới, bỏ trống nếu giữ nguyên. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {

    @Size(min = 6, max = 100, message = "Mật khẩu từ 6 đến 100 ký tự")
    private String password;

    @NotBlank(message = "Họ tên không được để trống")
    @Size(max = 100, message = "Họ tên tối đa 100 ký tự")
    private String fullName;

    @Size(max = 100, message = "Chức vụ tối đa 100 ký tự")
    private String position;

    @NotBlank(message = "Vai trò không được để trống")
    @Pattern(regexp = "(?i)ADMIN|MANAGER|STAFF", message = "Vai trò phải là ADMIN, MANAGER hoặc STAFF")
    private String role;

    @Pattern(regexp = "^(0|\\+84)[0-9]{9,10}$", message = "Số điện thoại không hợp lệ")
    private String phoneNumber;

    private Long branchId;
}
