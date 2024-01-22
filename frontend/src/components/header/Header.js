import React from 'react';
import { Link } from 'react-router-dom';


function Header({isAuthenticated, setIsAuthenticated}) {
	return (
		<header>
			<nav className="navbar navbar-expand-md navbar-dark bg-dark sticky-top">
        <div className="navbar-brand container">ToDoList App</div>
        <ul className="navbar-nav justify-content-end container">
          <li className="nav-link px-4"><Link to='/'>Home</Link></li>
          {isAuthenticated && <li className="nav-link px-4"><Link to='/todo'>My Todos</Link></li>}
          {/*{isAuthenticated && <li className="nav-link px-4"><Link to='/add'>Add Todo</Link></li>}*/}
          {!isAuthenticated && <li className="nav-link px-4"><Link to='/signin'>Login</Link></li>}
          {!isAuthenticated && <li className="nav-link px-4"><Link to='/signup'>Signup</Link></li>}
          {isAuthenticated && <li className="nav-link px-4"><Link to='/signout'>Logout</Link></li>}
          <li className="nav-link px-4"><Link to='/about'>About</Link></li>
        </ul>
      </nav>
		</header>
	)
}

export default Header;