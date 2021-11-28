# AttendanceManagementSystem

## Note: Run the discovery server at first, and then any of these services can be run in any arbitrary order.

######Terminal-1
```
cd discovery
./mvnw spring-boot:run
```
######Terminal-2
```
cd attendance
./mvnw spring-boot:run
```
######Terminal-3
```
cd course
./mvnw spring-boot:run
```
######Terminal-4
```
cd student
./mvnw spring-boot:run
```
######Terminal-5
```
cd Teacher
./mvnw spring-boot:run
```
######Terminal-6
```
cd gateway
./mvnw spring-boot:run
```

**All the services can be routed through gateway at port 3001**
```
*lhttp://ocalhost:3001/attendance/* - For Attendance
*http://localhost:3001/course/* - For Courses
*http://localhost:3001/student/* - For Students
*http://localhost:3001/teacher/* - For Teachers
```
