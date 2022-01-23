module.exports = {
	parser: '@typescript-eslint/parser',
	plugins: ['@typescript-eslint', 'prettier'],
	extends: ['plugin:prettier/recommended', 'plugin:@typescript-eslint/recommended', 'react-app'],
	rules: {
		'prettier/prettier': [
			'error',
			{
				singleQuote: true, // 작은 따옴표
				semi: true, // 세미콜론
				useTabs: true,
				tabWidth: 2,
				trailingComma: 'all',
				printWidth: 100, // 100자 마다 개행
				bracketSpacing: true,
				arrowParens: 'avoid',
				endOfLine: 'auto',
			},
		],
	},
};