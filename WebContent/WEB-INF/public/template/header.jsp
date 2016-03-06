          
         <!-- Form logout -->
        <form method="post" id="logoutForm" action="${pageContext.request.contextPath}/logout" id="form-logout">
		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>         
		</form>
				
		<!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation" ng-controller="HeaderController" >
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#definitions">Ripple Of Knowledge</a>
            </div>
            
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#" onclick="submitFormLogout();"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li ng-class="{ active: isActive('/definitions') }">
                        <a href="#definitions"><i class="fa fa-fw fa-home"></i> Home</a>
                    </li>
                    <li ng-class="{ active: isActive('/definition/') }">
                        <a href="charts.html"><i class="fa fa-fw fa-file"></i> New</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        
        <script type="text/javascript">
        	var submitFormLogout = function() {
        		$("#logoutForm").submit();
        	};
        </script>