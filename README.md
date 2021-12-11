# Apache-Log4j-poc

Based on: https://github.com/tangxiaofeng7/apache-log4j-poc

Before you run the program you need run a programa that listen to the specified port

Example:
```
sudo tcpdump -i lo0 port 636
```

slf4j uses slf4j library and it is not affected by the vulnerability

log4j uses the version affected by the vulnerability

If you add the JVM arg `-Dlog4j2.formatMsgNoLookups=true` to run log4j program, it will fix the issue.
