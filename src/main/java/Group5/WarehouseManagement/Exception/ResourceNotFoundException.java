package Group5.WarehouseManagement.Exception;

// Không tìm thấy dữ liệu (HTTP 404). 
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
