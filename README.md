1. to run vault server
````
docker-compose up
````

2. init, remember your 3 key and root token
````
vault operator init -key-shares=6 -key-threshold=3
````

3. unseal 3 key after init
````
vault operator unseal $key1
vault operator unseal $key2
vault operator unseal $key3
````
4. login vault
````
vault login $root_token
````