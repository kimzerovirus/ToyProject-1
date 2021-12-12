// env설정
// https://cli.vuejs.org/guide/mode-and-env.html#modes
// development is used by vue-cli-service serve
// test is used by vue-cli-service test:unit
// production is used by vue-cli-service build
module.exports = {
	devServer: {
		overlay: false,
		proxy: {
			'/api': {
				target: process.env.VUE_APP_API || 'http://localhost:8080',
			},
		},
		port: 3000,
	},
};
