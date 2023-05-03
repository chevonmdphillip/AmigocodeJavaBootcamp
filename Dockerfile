FROM ubuntu:latest
LABEL authors="chevy"

ENTRYPOINT ["top", "-b"]