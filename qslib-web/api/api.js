// 放置所有的请求接口地址

const url = 'http:127.0.0.1:9527/qslib'

const urls = class{
	static m(){
		// 注册接口
		const register = `${url}/userr/register`
		// 登录接口
		const login = `${url}/user/login`


		return{
			register,
			login

		}
	}
}

export default urls
