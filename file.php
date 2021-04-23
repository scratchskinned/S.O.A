<pre>
<?php
		$mathservice = new SoapClient ("http://localhost:12406/Calculette/CalculetteServiceService?WSDL");


	$plus =$mathservice->plus(array("i"=>5,"j"=>7));
		
		echo "le resultat de 5+7 est " .$plus->return;
			echo "<br>";

	$moins =$mathservice->moins(array("a"=>5,"b"=>7));
		
			echo "le resultat de 5-7 est " .$moins->return;
				echo "<br>";
			
	$div =$mathservice->div(array("t"=>8,"m"=>4));
		
		echo "le resultat de 8/4 est " .$div->return;
			echo "<br>";

	$multiplication =$mathservice->multiplication(array("d"=>11,"p"=>7));
		
			echo "le resultat de 11x7 est " .$multiplication->return;
				echo "<br>";

	$premier =$mathservice->premier(array("x"=>55));
	
		echo "55 est premier ?     " .$premier->return;
			if ($premier) {
				echo "oui";
			}
				else {echo "non";
		 	 }
				echo "<br>";

	$decomposition =$mathservice->decomposition(array("numbers"=>55));
	
		echo "le resultat de la decomposition de 55 en facteurs premiers est " .$decomposition->return;
			

?>


