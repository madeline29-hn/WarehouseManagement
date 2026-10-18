package Group5.WarehouseManagement.Exception;

//Dữ liệu bị trùng, ví dụ username đã tồn tại (HTTP 409).
public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(String message) {
        super(message);
    }
}
