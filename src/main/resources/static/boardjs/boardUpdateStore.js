const { defineStore } = Pinia;

const useBoardUpdateStore = defineStore('board_update', {
  // 공통으로 사용하는 데이터 설정 => static
  // redux => state (store) = action dispatch() => reduce :vuex
  // pinia = tanStack-Query
  // ----------------------- NodeJS / TypeScript
  // 받는 변수 (JSP) , 서버에서 결과값
  state: () => ({
	name: '',
	subject: '',
	content: '',
	pwd: '',
	no: 0
  }),
  // 서버와 연동
  /*
  	  RestFul
	  
	    SELECT : Get
		DELETE : Delete
		UPDATE : Put
		INSERT : Post
  */
  actions: {
	// insert => 유효성 검사 (NOT NULL = 반드시 입력이 되게 만든다)
	// 비동기 처리 => async
	async boardUpdate(nameRef, subRef, contRef, pwdRef) {
	  if (this.name === '') {
		nameRef.focus()
		retun
	  }
	  if (this.suject === '') {
	  		subRef.focus()
	  		retun
	  }
	  if (this.content === '') {
	  		contRef.focus()
	  		retun
	  }
	  if (this.pwd === '') {
	  		pwdRef.focus()
	  		retun
	  }
	  
	  // => JSP
	  const res = await axios.put('http://localhost:8080/board/update_ok_vue', {
		name: this.name,
		subject: this.subject,
		content: this.content,
		pwd: this.pwd,
		no: this.no
	  })
	  
	  if (res.data.msg === 'yes') {
		location.href = 'detail?no=' + this.no
	  } else {
		alert('비밀번호가 틀립니다')
		this.pwd = ''
		pwdRef.focus()
	  }
	},
	// detail
	async boardUpdateData(no) {
	  const res = await axios.get('http://localhost:8080/board/update_vue', {
		params: {
		  no: no
		}
	  })
	  console.log(res.data)
	  this.no = no
	  this.name = res.data.name
	  this.subject = res.data.subject
	  this.content = res.data.content
	}
  }
})