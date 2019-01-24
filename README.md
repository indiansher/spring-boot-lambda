# spring-boot-lambda

https://github.com/awslabs/aws-sam-cli
---

SAM CLI FOR LINUX (SPRING BOOT BASED LAMBDA APP)
---
1.  Install aws-sam-cli

        pip install --user aws-sam-cli
        
2. Add the following content to `~/.bashrc` [for python path], and restart terminal
        
        USER_BASE_PATH=$(python -m site --user-base)
        export PATH=$PATH:$USER_BASE_PATH/bin

3.  Install Docker (If not already installed)

4.  Then follow steps mentioned at: https://docs.docker.com/install/linux/linux-postinstall/#manage-docker-as-a-non-root-user
        
        a.  sudo groupadd docker
        b.  sudo usermod -aG docker $USER
        c.  Log out and log back in so that your group membership is re-evaluated.
        
        [If a previous installation of docker was already running with sudo]
        c.  sudo chown "$USER":"$USER" /home/"$USER"/.docker -R
        d.  sudo chmod g+rwx "$HOME/.docker" -R

5. Spring boot lambda test app

        a.  clone https://github.com/indiansher/spring-boot-lambda
        b.  mvn clean install -T 4
        c.  cd ~/spring-boot-lambda/sam-cli
        d.  sam local start-api
        e.  [From another terminal] curl http://127.0.0.1:3000/hello
        [Ignore errors for now, and check the terminal running SAM]
