@echo off
java -Dserver.port=8881 -Dcsp.sentinel.dashboard.server=localhost:8881 -Dproject.name=sentinel-dashboard -Dsentinel.dashboard.auth.username=admin -Dsentinel.dashboard.auth.password=admin123 -jar sentinel-dashboard-1.8.8.jar