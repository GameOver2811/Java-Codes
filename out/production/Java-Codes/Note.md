### Servlet
Package : javax.servlet.*;
## Non-left cycle methods
```inti( ServletConfig config )``` -----> Invoked jsut after object creation
```service( ServletRequest req, ServletResponse res )``` ---> called multiple times throughout the life cycle
```destroy()``` ---> envokes just before a servlet is unloaded


## Non-left cycle methods
```getServletConfig()``` --> used to get the reference of servlet config
```getServletInfo()``` ---> get the information of a servlet

### Tomcat - 9
### Maven