const http=require('http');
const net=require ('net');
const url =require ('url');
//create  an http tunneling proxy
const proxy=http.createServer((req,res)=>{
	res.writehead(200,{'content-type':'text/plain'});
		'
	res.end('okay');
});
proxy.on('connect',(req,cltSocket,Head)=>{
	//connect to an origine server
	const Srvurl=Url.parser('http://${req.url}');
	const srvSocket=net.connect(srvUrl.port,srvUrl.hostname,()=>{
		CltSocket.write('http/1.1 200 connection Established\r\n'+
			'proxy-agent:Node.js-proxy\r\n'+
				'\r|n');
				SrvSocket.write(head);
				SrvSocket.pipe(cltSocket);
				cltSocket.pipe(srvSocket);
				});
	});
		
	//now that  proxy  is  running
	proxy.listed(1337,'127.0.0.1',()=>{
		
		//make a request to a tunneling proxy
		const options={
			port:1337,
			hostname:'127.0.0.1'
			method:'connect',
			path:'www.google.com:80'
			});
			const req=http.request(options);
			req.end();
			req.on('connect',(res,Socket,head)=>{
				console.log('got connected!');
				//make a request over an HTTP tunnel  
				Socket.write('GET/HTTP/1.1\r\n'+
					'Host:www.google.com:80\r\n'+
						'connection:close\r\n'+
							'\r\n');
							Socket.on('data',(chunk)=>{
								console.log(chunk.toString());
								});
								Socket.on('end',()=>{
									proxy.close();
								});									
		});
	});  
	
	
