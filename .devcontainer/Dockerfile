# Base image with Java 17
FROM mcr.microsoft.com/devcontainers/java:17-bullseye

# Install Maven & Ant
RUN apt-get update && \
    apt-get install -y maven ant && \
    rm -rf /var/lib/apt/lists/*
