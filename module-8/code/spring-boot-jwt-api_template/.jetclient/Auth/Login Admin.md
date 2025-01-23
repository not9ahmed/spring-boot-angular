```toml
name = 'Login Admin'
method = 'POST'
url = 'http://localhost:8080/api/auth/login'
sortWeight = 1500000
id = '58d51542-08a8-4a60-b182-60802dccffa1'

[body]
type = 'JSON'
raw = '''
{
  username: "admin",
  password: "admin"
}'''
```
