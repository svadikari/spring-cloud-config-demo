# spring-colud-config-demo
spring-colud-config-demo

How to test the application?

1. Import the project using 'git clone https://github.com/svadikari/springcloud-config-client.git'
2. Start "config-server"
3. Browse "http://localhost:8888/myapp/stage" to see the configuration details.
4. Start "config-client"
5. Go to browser and execute "http://localhost:8082/?user=shyam"
5. You can see db url out as below
    <br/>Hello shyamfrom stage.com/stage
6. Update db url at https://github.com/svadikari/spring-cloud-config-repo.git/myapp-stage.yml
Refresh "http://localhost:8888/myapp/stage" to see updated configuration details
Refresh "http://localhost:8081/?user=shyam", but you don't see the updated configuration as config-server is idempotent.
Execute curl --request POST --location 'http://localhost:8081/actuator/refresh' --header 'Content-Type: application/json' and execute step#8