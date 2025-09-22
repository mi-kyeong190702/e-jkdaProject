# MyWebProject (Java 1.7 / Tomcat 7 / JSP+JSTL / MySQL)
Minimal starter to run on Tomcat 7 with JNDI DataSource (MySQL).

## Requirements
- Java 1.7
- Apache Tomcat 7.x
- JARs (copy into `WebContent/WEB-INF/lib/`):
  - **jstl-1.2.jar**
  - **mysql-connector-java-5.1.49.jar** (Connector/J 5.1.x works with Java 7)
    *Do NOT use 8.0.x (needs Java 8+).*

## Configure
- Edit `WebContent/META-INF/context.xml`:
  - url: `jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true`
  - username/password
- Create schema: `sql/schema.sql`

## Build & Run
- (Optional) Build WAR with Ant: `ant war` → `dist/MyWebProject.war`
- Deploy WAR to Tomcat 7 `webapps/` or use your IDE.
- Visit:
  - `/hello`
  - `/users`
  - `/no-such-page` (404 test)

## Notes
- 404 template is mapped via `<error-page>` in `web.xml`.
- Uses JNDI DataSource `jdbc/MyDS`. See `Db.java` and `context.xml`.
