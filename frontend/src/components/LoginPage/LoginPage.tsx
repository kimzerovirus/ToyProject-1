import { Link, useNavigate } from 'react-router-dom';

const LoginPage = () => {
	const path = process.env.PUBLIC_URL;
	const navigate = useNavigate();

	const submitHandler = (e: React.SyntheticEvent) => {
		e.preventDefault();
		const target = e.target as typeof e.target & {
			email: { value: string };
			password: { value: string };
		};
		console.log(target.email.value, target.password.value);

		if (target.email.value && target.password.value) navigate('/');
		else alert('빈 칸 존재함');
	};

	return (
		<div className="2xl:container h-screen m-auto">
			<div hidden className="fixed inset-0 w-6/12 lg:block">
				<img
					src={`${path}/전구맨2.gif`}
					className="w-full h-full object-cover"
					alt="로그인이미지"
				/>
			</div>
			<div className="relative h-full ml-auto lg:w-6/12 flex items-center">
				<div className="m-auto py-12 px-6 sm:p-20 xl:w-10/12">
					<div className="space-y-4 text-center">
						<Link to="">
							{/* <img
								src="../public/images/logo.svg"
								className="w-40"
								alt="tailus logo"
							/> */}
							Logo
						</Link>
						<p className="font-medium text-lg text-gray-600 text-center">
							Welcome to job web!
						</p>
					</div>

					{/* <div className="mt-12 grid gap-6 sm:grid-cols-2">
						<button className="py-3 px-6 rounded-xl bg-blue-50 hover:bg-blue-100 focus:bg-blue-100 active:bg-blue-200">
							<div className="flex gap-4 justify-center">
								<img src="../public/images/google.svg" className="w-5" alt="" />
								<span className="block w-max font-medium tracking-wide text-sm text-blue-700">
									with Google
								</span>
							</div>
						</button>
						<button className="py-3 px-6 rounded-xl bg-gray-900 transition hover:bg-gray-800 active:bg-gray-600 focus:bg-gray-700">
							<div className="flex gap-4 items-center justify-center text-white">
								<svg
									xmlns="http://www.w3.org/2000/svg"
									fill="currentColor"
									className="w-5"
									viewBox="0 0 16 16"
								>
									<path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z" />
								</svg>
								<span className="block w-max font-medium tracking-wide text-sm text-white">
									with Github
								</span>
							</div>
						</button>
					</div> 

					<div role="hidden" className="mt-12 border-t">
						<span className="block w-max mx-auto -mt-3 px-4 text-center text-gray-500 bg-white">
							Or
						</span>
					</div>
					*/}

					<form onSubmit={submitHandler} className="space-y-6 py-6">
						<div>
							<input
								type="email"
								name="email"
								placeholder="Your Email"
								className="w-full py-3 px-6 ring-1 ring-gray-300 rounded-xl placeholder-gray-600 bg-transparent transition disabled:ring-gray-200 disabled:bg-gray-100 disabled:placeholder-gray-400 invalid:ring-red-400 focus:invalid:outline-none"
							/>
						</div>

						<div className="flex flex-col items-end">
							<input
								type="password"
								name="password"
								placeholder="What's the secret word ?"
								className="w-full py-3 px-6 ring-1 ring-gray-300 rounded-xl placeholder-gray-600 bg-transparent transition disabled:ring-gray-200 disabled:bg-gray-100 disabled:placeholder-gray-400 invalid:ring-red-400 focus:invalid:outline-none"
							/>
							<Link to="/find" className="w-max p-3 -mr-3">
								<span className="text-sm tracking-wide text-blue-600">
									Forgot password
								</span>
							</Link>
						</div>

						<div>
							<button
								type="submit"
								className="w-full px-6 py-3 rounded-xl bg-sky-500 transition hover:bg-sky-600 focus:bg-sky-600 active:bg-sky-800"
							>
								<span className="font-semibold text-white text-lg">Login</span>
							</button>
							<Link to="/signup" className="w-max p-3-ml-3">
								<span className="text-sm tracking-wide text-blue-600">
									Create new account
								</span>
							</Link>
						</div>
					</form>

					<div className="border-t pt-12">
						<div className="space-y-2 text-center">
							<img src="" alt="" className="w-40 m-auto grayscale" />
							<span className="block text-sm tracking-wide text-gray-400">
								Copyright &copy; 2021 KZV&KJY ALL Right reserved.
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	);
};

export default LoginPage;
