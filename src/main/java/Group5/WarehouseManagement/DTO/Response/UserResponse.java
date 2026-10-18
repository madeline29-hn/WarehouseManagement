package Group5.WarehouseManagement.DTO.Response;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Không bao giờ chứa password. Branch được làm phẳng thành branchId + branchName. */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {

    private Long userId;
    private String username;
    private String fullName;
    private String position;
    private String role;
    private String phoneNumber;
    private Long branchId;
    private String branchName;
}
