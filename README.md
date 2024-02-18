# Aubay - Java e IOT

### antes de tudo:
```console
fagner@fagner:~$ sudo apt install -y rabbitmq-server
```
```console
fagner@fagner:~$ rabbitmqctl add_user meuuser minhapass
```
```console
fagner@fagner:~$ rabbitmqctl set_permissions -p / meuuser ".*" ".*" ".*"
```
```console
fagner@fagner:~$ rabbitmq-plugins enable rabbitmq_management
```
```console
fagner@fagner:~$ rabbitmqctl set_user_tags meuuser administrator
```
```console
fagner@fagner:~$ rabbitmq-plugins enable rabbitmq_mqtt
```
```console
fagner@fagner:~$ sudo apt update -y && sudo apt install mosquitto mosquitto-clients -y
```

### envio de mensagens usando o mosquitto
```console
fagner@fagner:~$ mosquitto_pub -h 127.0.0.1 -p 1883 -t bindingKey -m "Testando 1.2.3"
```

