## Github Action을 사용한 CI/CD 과정

![과정](https://github.com/reader-wh94/dbd-backend/assets/68210266/4f412a76-a6d9-41f3-a462-030b79321395)

1. Github Action

   .github/workflows의 main.yml 확인

   

2. AWS S3

   ![S3](https://github.com/reader-wh94/dbd-backend/assets/68210266/3096ac5d-4caa-43c1-ae09-6db65c182dc9)

   GIthub Actions에서 코드 빌드 성공후 AWS S3에 .zip 파일을 업로드

   

3. AWS CodeDeploy에서 배포 내역 확인

   ![codedeploy](https://github.com/reader-wh94/dbd-backend/assets/68210266/a6648504-80c9-4106-805b-e8d5f2c1f92b)

4. EC2 서버에서 애플리케이션 실행 확인