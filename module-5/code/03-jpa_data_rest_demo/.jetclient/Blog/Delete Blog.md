```toml
name = 'Delete Blog'
method = 'DELETE'
url = 'http://localhost:8080/blogs/2'
sortWeight = 5000000
id = '1f273531-59e9-4020-9342-a48f7a706e68'

[body]
type = 'JSON'
raw = '''
{
  title: "Second blog title updated",
  content: "Second blog updated",
}'''
```
