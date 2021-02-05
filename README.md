
Demo project illustrating https://github.com/aws/aws-sam-cli/issues/2434

Run:

`mvn package`

`sam local start-api`

Next issue request:

`curl http://127.0.0.1:3000/`

You will see the following log message

`Invalid lambda response received: Invalid API Gateway Response Keys: {'base64Encoded'} in {'statusCode': 200, 'multiValueHeaders': {}, 'body': 'hello world', 'isBase64Encoded': False, 'base64Encoded': False}`
