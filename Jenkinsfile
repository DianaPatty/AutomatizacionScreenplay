import java.text.SimpleDateFormat

def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def date = new Date()
def timestamp = dateFormat.format(date).toString()
def CORREOS = "dipagal_45@hotmail.com;

pipeline{
	agent any

	stages{
		stage('Actualizar Codigo Fuente') {
		 	steps{
		 		git url: 'https://github.com/DianaPatty/AutomatizacionScreenplay.git'
			}
		}

		stage('Test')
		{
			steps{
				script{
					try{
						bat ("gradle clean test -Dcucumber.filter.tags=@smokeTest")
						echo 'Ha ejecutado sin fallo test junit'
						
						emailext (
          					subject: "EJECUCION EXITOSA ESCENARIOS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
          					body: """<p><b style="color:MediumSeaGreen;">EJECUCION EXITOSA:</b> Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
            					<p><b>Para verificar el estado de la ejecucion ingrese a:</b> &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
         					 to:"${CORREOS}"
        				)	  				        									
					}
					catch(ex)
					{    
						emailext (
          					subject: "EJECUCION FALLIDA ESCENARIOS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
          					body: """<p><b style="color:red;">EJECUCION FALLIDA:</b> Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
            					<p><b>Para verificar el estado de la ejecucion ingrese a:</b> &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
         					 to:"${CORREOS}"
        				)
					
	    				echo 'Finalizo ejecucion de framework junit con fallos'
	    				if (currentBuild.result == 'UNSTABLE')
         						currentBuild.result = 'FAILURE'
      					throw ex
					}
					finally{						    
						try{
							bat " rename \"${WORKSPACE}\\target\\site\\serenity\" serenity_${timestamp}"
		                    echo 'Backup de evidencias realizado con exito'
		                          
		                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: "${WORKSPACE}\\target\\site\\serenity_${timestamp}", reportFiles: 'index.html', reportName: 'Evidencias Pruebas Aceptacion', reportTitles: ''])
							echo 'Reporte Html realizado con exito'
						
						}
						catch(e)
						{    
							echo 'No se realizo el Backup de evidencias'
			    			publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: "${WORKSPACE}\\target\\site\\serenity", reportFiles: 'index.html', reportName: 'Evidencias Pruebas Aceptacion', reportTitles: ''])
							echo 'Reporte Html realizado con exito'
								
							currentBuild.result='SUCCESS'
						}
					}
				}
			}	
		}		
	}	
}