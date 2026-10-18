package Group5.WarehouseManagement.Exception;


// Vi phạm quy tắc nghiệp vụ (HTTP 400).
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
