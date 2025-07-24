# Ứng dụng Quản lý Sinh viên - Spring Boot & Hibernate (Triển khai DAO thủ công)

Đây là một dự án **Demo Spring ORM đơn giản** được xây dựng để thực hiện các thao tác **CRUD** (Tạo, Đọc, Cập nhật, Xóa) cho việc quản lý sinh viên.

> 🔍 **Điểm nhấn** của dự án là việc **triển khai tầng truy cập dữ liệu (Data Access Layer) thủ công**.  
> Thay vì dùng Spring Data JPA, dự án sử dụng **EntityManager trực tiếp thông qua API JPA**, giúp thể hiện **sự hiểu biết sâu hơn** về cách Spring Framework tích hợp với Hibernate ở tầng thấp.

---

## 🧱 Kiến trúc dự án

Dự án tuân theo kiến trúc phân tầng rõ ràng:

### 🧩 Controller Layer (`StudentController.java`)

- Tiếp nhận các HTTP request từ client.
- Chịu trách nhiệm về API Endpoints.
- Gọi đến Service Layer để xử lý nghiệp vụ.

### 🔧 Service Layer (`StudentService.java`)

- Chứa **logic nghiệp vụ chính** của ứng dụng.
- Quản lý giao dịch với `@Transactional`.

### 🗃 Data Access Layer (`StudentDAO.java` & `StudentDAOImpl.java`)

- **Triển khai thủ công**, không dùng Spring Data JPA.
- `StudentDAO`: Interface định nghĩa các phương thức truy cập dữ liệu.
- `StudentDAOImpl`: Lớp triển khai, sử dụng `@PersistenceContext` để tiêm `EntityManager` và thực hiện các thao tác với database bằng JPA API.

### 📦 Model / Entity Layer (`Student.java`)

- Là một POJO được đánh dấu `@Entity`, ánh xạ với bảng trong database thông qua Hibernate.

---

## 🛠 Công nghệ sử dụng

- **Java 17**
- **Spring Boot 3.x.x**: Nền tảng chính để xây dựng ứng dụng.
- **Spring Web**: Xây dựng các RESTful API.
- **Spring ORM + JPA/Hibernate**: Tích hợp với Hibernate, hỗ trợ triển khai DAO thủ công.
- **H2 Database**: Cơ sở dữ liệu trong bộ nhớ (in-memory), tiện lợi cho demo.
- **Maven**: Quản lý project và dependencies.
- **Lombok**: Giảm thiểu code lặp (getters, setters, constructors,...).
