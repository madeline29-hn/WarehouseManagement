package Group5.WarehouseManagement.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchResponse {

    private Long branchId;
    private String branchName;
    private String address;
    private String phoneNumber;
    private String email;
    private Boolean isActive;
}
